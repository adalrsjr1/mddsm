package br.inf.ufg.mddsm.broker.manager;

public interface SignalHandler {
    HandlingResult handle(SignalInstance signal, ManagerContext ctx);
}
