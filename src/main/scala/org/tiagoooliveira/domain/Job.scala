package org.tiagoooliveira.domain

case class Job(
    id: Option[String],
    job_type: Option[Int],
    urgent: Option[Int]
  )