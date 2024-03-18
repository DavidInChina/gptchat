package ti;

import java.util.List;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public final List f46246a;

    /* renamed from: b  reason: collision with root package name */
    public final char f46247b;

    /* renamed from: c  reason: collision with root package name */
    public final int f46248c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f46249d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f46250e;

    /* renamed from: f  reason: collision with root package name */
    public d f46251f;

    /* renamed from: g  reason: collision with root package name */
    public d f46252g;

    public d(List list, char c10, boolean z10, boolean z11, d dVar) {
        this.f46246a = list;
        this.f46247b = c10;
        this.f46249d = z10;
        this.f46250e = z11;
        this.f46251f = dVar;
        this.f46248c = list.size();
    }

    public final List a(int i10) {
        List list = this.f46246a;
        if (i10 >= 1 && i10 <= list.size()) {
            return list.subList(0, i10);
        }
        throw new IllegalArgumentException("length must be between 1 and " + list.size() + ", was " + i10);
    }

    public final List b(int i10) {
        List list = this.f46246a;
        if (i10 >= 1 && i10 <= list.size()) {
            return list.subList(list.size() - i10, list.size());
        }
        throw new IllegalArgumentException("length must be between 1 and " + list.size() + ", was " + i10);
    }
}
