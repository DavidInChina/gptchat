package Rh;

import java.util.List;
import java.util.Map;
import th.AbstractC5806n;
import yh.AbstractC6603e;
import yh.AbstractC6632q;
import yh.l1;

/* loaded from: classes2.dex */
public final class P0 extends AbstractC6603e {

    /* renamed from: Y  reason: collision with root package name */
    public final String f15686Y;

    /* renamed from: Z  reason: collision with root package name */
    public final String f15687Z;

    /* renamed from: h0  reason: collision with root package name */
    public final String f15688h0;

    /* renamed from: i0  reason: collision with root package name */
    public final AbstractC1322q0 f15689i0;

    /* renamed from: j0  reason: collision with root package name */
    public final Map f15690j0;

    /* renamed from: k0  reason: collision with root package name */
    public final List f15691k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ d1 f15692l0;

    public P0(d1 d1Var, String str, String str2, String str3, AbstractC1322q0 abstractC1322q0, Map map, List list) {
        this.f15692l0 = d1Var;
        this.f15686Y = str;
        this.f15687Z = str2;
        this.f15688h0 = str3;
        this.f15689i0 = abstractC1322q0;
        this.f15690j0 = map;
        this.f15691k0 = list;
    }

    @Override // yh.AbstractC6600d, sh.AbstractC5637i.a
    public final String N0() {
        return this.f15688h0;
    }

    @Override // yh.AbstractC6603e, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC6632q mo118a() {
        return this.f15692l0;
    }

    @Override // sh.AbstractC5637i
    public final String f1() {
        return this.f15686Y;
    }

    @Override // th.AbstractC5808p
    public final AbstractC5806n getDeclaredAnnotations() {
        return B0.h(this.f15692l0.f15814i0, this.f15691k0);
    }

    @Override // yh.AbstractC6612h
    public final l1.a getType() {
        return this.f15689i0.d(this.f15687Z, this.f15692l0.f15814i0, this.f15690j0, this);
    }

    @Override // yh.AbstractC6603e, sh.AbstractC5633e, wh.AbstractC6242g
    /* renamed from: a */
    public final yh.l1 mo118a() {
        return this.f15692l0;
    }
}
