package oe;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import xe.C6410O;

/* renamed from: oe.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4998g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C6410O f41316Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f41317Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4999h f41318h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f41319i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4998g(C4999h c4999h, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f41318h0 = c4999h;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f41317Z = obj;
        this.f41319i0 |= Integer.MIN_VALUE;
        return this.f41318h0.b(null, null, null, null, null, this);
    }
}
