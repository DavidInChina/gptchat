package m3;

import android.text.Layout;

/* renamed from: m3.g  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4558g {

    /* renamed from: a  reason: collision with root package name */
    public String f38916a;

    /* renamed from: b  reason: collision with root package name */
    public int f38917b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f38918c;

    /* renamed from: d  reason: collision with root package name */
    public int f38919d;

    /* renamed from: e  reason: collision with root package name */
    public boolean f38920e;

    /* renamed from: k  reason: collision with root package name */
    public float f38926k;

    /* renamed from: l  reason: collision with root package name */
    public String f38927l;

    /* renamed from: o  reason: collision with root package name */
    public Layout.Alignment f38930o;

    /* renamed from: p  reason: collision with root package name */
    public Layout.Alignment f38931p;

    /* renamed from: r  reason: collision with root package name */
    public C4553b f38933r;

    /* renamed from: f  reason: collision with root package name */
    public int f38921f = -1;

    /* renamed from: g  reason: collision with root package name */
    public int f38922g = -1;

    /* renamed from: h  reason: collision with root package name */
    public int f38923h = -1;

    /* renamed from: i  reason: collision with root package name */
    public int f38924i = -1;

    /* renamed from: j  reason: collision with root package name */
    public int f38925j = -1;

    /* renamed from: m  reason: collision with root package name */
    public int f38928m = -1;

    /* renamed from: n  reason: collision with root package name */
    public int f38929n = -1;

    /* renamed from: q  reason: collision with root package name */
    public int f38932q = -1;

    /* renamed from: s  reason: collision with root package name */
    public float f38934s = Float.MAX_VALUE;

    public final void a(C4558g c4558g) {
        int i10;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (c4558g != null) {
            if (!this.f38918c && c4558g.f38918c) {
                this.f38917b = c4558g.f38917b;
                this.f38918c = true;
            }
            if (this.f38923h == -1) {
                this.f38923h = c4558g.f38923h;
            }
            if (this.f38924i == -1) {
                this.f38924i = c4558g.f38924i;
            }
            if (this.f38916a == null && (str = c4558g.f38916a) != null) {
                this.f38916a = str;
            }
            if (this.f38921f == -1) {
                this.f38921f = c4558g.f38921f;
            }
            if (this.f38922g == -1) {
                this.f38922g = c4558g.f38922g;
            }
            if (this.f38929n == -1) {
                this.f38929n = c4558g.f38929n;
            }
            if (this.f38930o == null && (alignment2 = c4558g.f38930o) != null) {
                this.f38930o = alignment2;
            }
            if (this.f38931p == null && (alignment = c4558g.f38931p) != null) {
                this.f38931p = alignment;
            }
            if (this.f38932q == -1) {
                this.f38932q = c4558g.f38932q;
            }
            if (this.f38925j == -1) {
                this.f38925j = c4558g.f38925j;
                this.f38926k = c4558g.f38926k;
            }
            if (this.f38933r == null) {
                this.f38933r = c4558g.f38933r;
            }
            if (this.f38934s == Float.MAX_VALUE) {
                this.f38934s = c4558g.f38934s;
            }
            if (!this.f38920e && c4558g.f38920e) {
                this.f38919d = c4558g.f38919d;
                this.f38920e = true;
            }
            if (this.f38928m == -1 && (i10 = c4558g.f38928m) != -1) {
                this.f38928m = i10;
            }
        }
    }
}
