package e9;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: e9.l  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2819l extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C2820m f29081Y;

    /* renamed from: Z  reason: collision with root package name */
    public List f29082Z;

    /* renamed from: h0  reason: collision with root package name */
    public Collection f29083h0;

    /* renamed from: i0  reason: collision with root package name */
    public Iterator f29084i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f29085j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C2820m f29086k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f29087l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2819l(C2820m c2820m, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f29086k0 = c2820m;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f29085j0 = obj;
        this.f29087l0 |= Integer.MIN_VALUE;
        return this.f29086k0.b(this);
    }
}
