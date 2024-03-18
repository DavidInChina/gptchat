package Bc;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* loaded from: classes.dex */
public final class a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public b f2046Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f2047Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ b f2048h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f2049i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f2048h0 = bVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f2047Z = obj;
        this.f2049i0 |= Integer.MIN_VALUE;
        return this.f2048h0.b(this);
    }
}
