package Kd;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import rb.C5424n;

/* loaded from: classes2.dex */
public final class F extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f9659Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f9660Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5424n f9661h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public F(C5424n c5424n, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f9661h0 = c5424n;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f9659Y = obj;
        this.f9660Z |= Integer.MIN_VALUE;
        return this.f9661h0.c(null, this);
    }
}
