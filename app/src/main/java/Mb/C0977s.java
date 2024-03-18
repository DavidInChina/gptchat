package Mb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: Mb.s  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0977s extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C0981u f11975Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f11976Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0981u f11977h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f11978i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0977s(C0981u c0981u, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f11977h0 = c0981u;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f11976Z = obj;
        this.f11978i0 |= Integer.MIN_VALUE;
        return C0981u.m(this.f11977h0, this);
    }
}
