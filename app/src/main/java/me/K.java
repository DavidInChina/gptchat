package me;

import id.AbstractC3557B;
import nf.AbstractC4825e;
import te.C5760d;

/* loaded from: classes2.dex */
public final class K implements U {

    /* renamed from: a  reason: collision with root package name */
    public final wf.o f39169a;

    /* renamed from: b  reason: collision with root package name */
    public final U f39170b;

    public K(wf.o oVar, U u10) {
        AbstractC3557B.c0("interceptor", oVar);
        this.f39169a = oVar;
        this.f39170b = u10;
    }

    @Override // me.U
    public final Object a(C5760d c5760d, AbstractC4825e abstractC4825e) {
        return this.f39169a.invoke(this.f39170b, c5760d, abstractC4825e);
    }
}
