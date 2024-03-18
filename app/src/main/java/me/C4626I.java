package me;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: me.I  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4626I extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C4627J f39161Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f39162Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4627J f39163h0;

    /* renamed from: i0  reason: collision with root package name */
    public int f39164i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4626I(C4627J c4627j, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f39163h0 = c4627j;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f39162Z = obj;
        this.f39164i0 |= Integer.MIN_VALUE;
        return this.f39163h0.a(null, this);
    }
}
