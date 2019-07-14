package br.inf.ufg.mddsm.controller.policy.repository;

import java.util.List;

public interface PolicyRepository {
    List<Policy> load(String request, String oper);
}
