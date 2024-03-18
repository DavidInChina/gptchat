package rb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: rb.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5423m extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44715Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f44716Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5424n f44717h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5423m(C5424n c5424n, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f44717h0 = c5424n;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f44715Y = obj;
        this.f44716Z |= Integer.MIN_VALUE;
        return this.f44717h0.c(null, this);
    }
}
