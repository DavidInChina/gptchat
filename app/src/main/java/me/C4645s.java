package me;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: me.s  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4645s extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f39235Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4647u f39236Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f39237h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4645s(C4647u c4647u, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f39236Z = c4647u;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f39235Y = obj;
        this.f39237h0 |= Integer.MIN_VALUE;
        C4647u.a(this.f39236Z, null, null, this);
        return jf.y.f36177a;
    }
}
