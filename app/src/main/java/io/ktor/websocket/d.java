package io.ktor.websocket;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class d extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public int f33615Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f33616Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ j f33617h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33618i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(j jVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33617h0 = jVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33616Z = obj;
        this.f33618i0 |= Integer.MIN_VALUE;
        return j.a(this.f33617h0, null, null, this);
    }
}
