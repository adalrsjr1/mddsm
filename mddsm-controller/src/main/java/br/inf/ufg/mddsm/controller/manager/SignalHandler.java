package br.inf.ufg.mddsm.controller.manager;

public interface SignalHandler {
    HandlingResult handle(SignalInstance signal, ManagerContext ctx);
}
