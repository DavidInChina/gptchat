package kd;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import y.F;

/* renamed from: kd.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4251o extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f37333Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f37334Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ F f37335h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4251o(F f6, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f37335h0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f37333Y = obj;
        this.f37334Z |= Integer.MIN_VALUE;
        return this.f37335h0.c(null, this);
    }
}
