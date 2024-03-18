package nh;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: nh.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4857g extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4858h f40379Y;

    /* renamed from: Z  reason: collision with root package name */
    public q4.k f40380Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f40381h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C4858h f40382i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f40383j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4857g(C4858h c4858h, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f40382i0 = c4858h;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f40381h0 = obj;
        this.f40383j0 |= Integer.MIN_VALUE;
        return this.f40382i0.b(this);
    }
}
