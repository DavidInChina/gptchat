package b4;

import e4.C2797e;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: b4.e  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2124e extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public AbstractC2125f f25623Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f25624Z;

    /* renamed from: h0  reason: collision with root package name */
    public C2797e f25625h0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f25626i0;

    /* renamed from: j0  reason: collision with root package name */
    public Object f25627j0;

    /* renamed from: k0  reason: collision with root package name */
    public boolean f25628k0;

    /* renamed from: l0  reason: collision with root package name */
    public /* synthetic */ Object f25629l0;

    /* renamed from: m0  reason: collision with root package name */
    public final /* synthetic */ AbstractC2125f f25630m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f25631n0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2124e(AbstractC2125f abstractC2125f, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f25630m0 = abstractC2125f;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f25629l0 = obj;
        this.f25631n0 |= Integer.MIN_VALUE;
        return this.f25630m0.c(false, null, this);
    }
}
