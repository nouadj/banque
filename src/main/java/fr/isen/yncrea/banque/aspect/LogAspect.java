package fr.isen.yncrea.banque.aspect;

import org.apache.logging.log4j.*;
import org.aspectj.lang.*;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LogAspect {
  private final static Logger LOG = LogManager.getLogger();

 
  public void logBefore(JoinPoint jp) {
    LogAspect.LOG.info("Passage avant {} {}", jp.getTarget(), jp.getSignature());
  }

  public void logAfter(JoinPoint jp) {
    LogAspect.LOG.info("Passage apres {} {}", jp.getTarget(), jp.getSignature());
  }
}