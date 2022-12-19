package com.eroldme.d66.appuser.register.verificationtoken;

import com.eroldme.d66.appuser.AppUser;
import lombok.*;

import javax.persistence.*;

import java.time.Instant;

import static javax.persistence.FetchType.LAZY;

/**
 * @author Mompati 'Patco' Keetile
 * @created 19-12-2022 @ 12:04
 */
@Getter @Setter @AllArgsConstructor @NoArgsConstructor @Builder(builderMethodName = "NewToken")
@Entity
@Table(name = "token")
public class VerificationToken {
  @Id
  @SequenceGenerator(name = "token_id_seq", sequenceName = "token_id_seq", allocationSize = 1)
  @GeneratedValue(generator = "token_id_seq", strategy = GenerationType.IDENTITY)
  private Long id;
  private String token;
  @ManyToOne(fetch = LAZY)
  private AppUser appUser;
  private Instant expiresAt;
}