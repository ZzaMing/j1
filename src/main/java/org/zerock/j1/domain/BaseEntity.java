package org.zerock.j1.domain;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import jakarta.persistence.Column;
import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;

@MappedSuperclass
@Getter
@EntityListeners(value = {AuditingEntityListener.class})
public abstract class BaseEntity {
  
  @CreatedDate
  @Column(updatable = false)
  private LocalDateTime regDate;

  @LastModifiedDate
  private LocalDateTime midDate;
  
}
