package com.dungnguyen.core.domain.model.mapper

interface DomainMapper<D, U> {
    fun mapToUI(domainEntity: D): U
}