package fh;

import java.util.LinkedHashMap;
import jf.C3952b;
import nf.AbstractC4825e;
import pf.AbstractC5156c;

/* renamed from: fh.G  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3064G extends AbstractC5156c {

    /* renamed from: Y  reason: collision with root package name */
    public C3952b f30811Y;

    /* renamed from: Z  reason: collision with root package name */
    public C3065H f30812Z;

    /* renamed from: h0  reason: collision with root package name */
    public LinkedHashMap f30813h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f30814i0;

    /* renamed from: j0  reason: collision with root package name */
    public /* synthetic */ Object f30815j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C3065H f30816k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f30817l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3064G(C3065H c3065h, AbstractC4825e abstractC4825e) {
        super(abstractC4825e);
        this.f30816k0 = c3065h;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        this.f30815j0 = obj;
        this.f30817l0 |= Integer.MIN_VALUE;
        return C3065H.a(this.f30816k0, null, this);
    }
}
