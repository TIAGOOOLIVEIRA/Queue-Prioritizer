package org.tiagoooliveira.domain

trait AgentBase {
  def id: String
  def agentType: Int
  def secondarySkill: List[String]
  def primarySkill: List[String]
  def urgent: Int
  def addJob(job: Job)
  def exec()
}