package g4;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: g4.t  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3192t extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f31257Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f31258Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ M1.v f31259h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3192t(M1.v vVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f31259h0 = vVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f31257Y = obj;
        this.f31258Z |= Integer.MIN_VALUE;
        return this.f31259h0.c(null, this);
    }
}
