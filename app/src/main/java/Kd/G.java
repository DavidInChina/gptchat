package Kd;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import rb.C5424n;

/* loaded from: classes2.dex */
public final class G extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f9662Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f9663Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5424n f9664h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public G(C5424n c5424n, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f9664h0 = c5424n;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f9662Y = obj;
        this.f9663Z |= Integer.MIN_VALUE;
        return this.f9664h0.c(null, this);
    }
}
