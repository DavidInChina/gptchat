package Qg;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import rb.C5424n;

/* renamed from: Qg.h0  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1205h0 extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f14856Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f14857Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5424n f14858h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1205h0(C5424n c5424n, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f14858h0 = c5424n;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f14856Y = obj;
        this.f14857Z |= Integer.MIN_VALUE;
        return this.f14858h0.c(null, this);
    }
}
