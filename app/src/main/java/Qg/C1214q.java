package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Qg.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1214q extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14894Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r f14895Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f14896h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1214q(r rVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14895Z = rVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14894Y = obj;
        this.f14896h0 |= Integer.MIN_VALUE;
        return this.f14895Z.c(null, this);
    }
}
