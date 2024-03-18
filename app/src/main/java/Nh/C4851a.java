package nh;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: nh.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4851a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4853c f40366Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f40367Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4852b f40368h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f40369i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4851a(C4852b c4852b, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f40368h0 = c4852b;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f40367Z = obj;
        this.f40369i0 |= Integer.MIN_VALUE;
        return this.f40368h0.j(this);
    }
}
