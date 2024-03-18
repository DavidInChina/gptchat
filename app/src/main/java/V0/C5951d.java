package v0;

import java.util.ArrayList;
import java.util.List;

/* renamed from: v0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5951d {

    /* renamed from: a  reason: collision with root package name */
    public final String f46917a;

    /* renamed from: b  reason: collision with root package name */
    public final float f46918b;

    /* renamed from: c  reason: collision with root package name */
    public final float f46919c;

    /* renamed from: d  reason: collision with root package name */
    public final float f46920d;

    /* renamed from: e  reason: collision with root package name */
    public final float f46921e;

    /* renamed from: f  reason: collision with root package name */
    public final float f46922f;

    /* renamed from: g  reason: collision with root package name */
    public final float f46923g;

    /* renamed from: h  reason: collision with root package name */
    public final float f46924h;

    /* renamed from: i  reason: collision with root package name */
    public final List f46925i;

    /* renamed from: j  reason: collision with root package name */
    public final List f46926j;

    public C5951d(String str, float f6, float f10, float f11, float f12, float f13, float f14, float f15, List list, int i10) {
        str = (i10 & 1) != 0 ? "" : str;
        f6 = (i10 & 2) != 0 ? 0.0f : f6;
        f10 = (i10 & 4) != 0 ? 0.0f : f10;
        f11 = (i10 & 8) != 0 ? 0.0f : f11;
        f12 = (i10 & 16) != 0 ? 1.0f : f12;
        f13 = (i10 & 32) != 0 ? 1.0f : f13;
        f14 = (i10 & 64) != 0 ? 0.0f : f14;
        f15 = (i10 & 128) != 0 ? 0.0f : f15;
        if ((i10 & 256) != 0) {
            int i11 = AbstractC5944H.f46870a;
            list = kf.v.f37483Y;
        }
        ArrayList arrayList = new ArrayList();
        this.f46917a = str;
        this.f46918b = f6;
        this.f46919c = f10;
        this.f46920d = f11;
        this.f46921e = f12;
        this.f46922f = f13;
        this.f46923g = f14;
        this.f46924h = f15;
        this.f46925i = list;
        this.f46926j = arrayList;
    }
}
