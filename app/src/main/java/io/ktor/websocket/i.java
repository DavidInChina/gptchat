package io.ktor.websocket;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class i extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public j f33642Y;

    /* renamed from: Z  reason: collision with root package name */
    public Throwable f33643Z;

    /* renamed from: h0  reason: collision with root package name */
    public b f33644h0;

    /* renamed from: i0  reason: collision with root package name */
    public /* synthetic */ Object f33645i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ j f33646j0;

    /* renamed from: k0  reason: collision with root package name */
    public int f33647k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33646j0 = jVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33645i0 = obj;
        this.f33647k0 |= Integer.MIN_VALUE;
        return this.f33646j0.d(null, null, this);
    }
}
