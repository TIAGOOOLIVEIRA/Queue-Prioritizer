package org.tiagoooliveira.engine

import org.tiagoooliveira.domain.Job

import scala.collection.SortedSet

abstract class QueueBase {
  def queue: SortedSet[Job]
  def enqueue(enq: Job): SortedSet[Job]
  def dequeue(): SortedSet[Job]
}

class FIFOPriorityTSQueue extends QueueBase{

  override def enqueue(enq: Job): Unit = ???

  override def dequeue(): QueueBase = ???

  override def queue: SortedSet[Job] = ???
}

trait PriorityOrder extends QueueBase{
  abstract override def enqueue(enq: Job): SortedSet[Job] = {
    super.enqueue(enq)
    //List(queue.sorted(if (job.urgent) Ordering.Int else Ordering.Int.reverse)
    SortedSet[Job]
  }
}