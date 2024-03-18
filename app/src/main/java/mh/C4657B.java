package mh;

import nf.AbstractC4825e;
import pf.AbstractC5156c;
import rb.C5424n;

/* renamed from: mh.B  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4657B extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39395Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f39396Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C5424n f39397h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4657B(C5424n c5424n, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f39397h0 = c5424n;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f39395Y = obj;
        this.f39396Z |= Integer.MIN_VALUE;
        return this.f39397h0.c(null, this);
    }
}
