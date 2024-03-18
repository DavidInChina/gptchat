package xc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import y.F;

/* renamed from: xc.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6393b extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f49790Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f49791Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ F f49792h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6393b(F f6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49792h0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49790Y = obj;
        this.f49791Z |= Integer.MIN_VALUE;
        return this.f49792h0.c(null, this);
    }
}
