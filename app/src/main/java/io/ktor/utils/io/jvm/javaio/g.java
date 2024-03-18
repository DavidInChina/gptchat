package io.ktor.utils.io.jvm.javaio;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes2.dex */
public final class g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public h f33499Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f33500Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ h f33501h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f33502i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h hVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f33501h0 = hVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f33500Z = obj;
        this.f33502i0 |= Integer.MIN_VALUE;
        return this.f33501h0.a(this);
    }
}
