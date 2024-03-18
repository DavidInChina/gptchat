package nh;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: nh.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4856f extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public Object f40375Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f40376Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4858h f40377h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f40378i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4856f(C4858h c4858h, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f40377h0 = c4858h;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f40376Z = obj;
        this.f40378i0 |= Integer.MIN_VALUE;
        return this.f40377h0.e(null, this);
    }
}
