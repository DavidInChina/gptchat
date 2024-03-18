package xb;

import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: xb.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6388a extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f49779Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C6390c f49780Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f49781h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6388a(C6390c c6390c, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f49780Z = c6390c;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f49779Y = obj;
        this.f49781h0 |= Integer.MIN_VALUE;
        return this.f49780Z.a(false, this);
    }
}
