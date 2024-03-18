package ti;

import java.util.ArrayList;
import wi.s;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: e  reason: collision with root package name */
    public StringBuilder f46302e;

    /* renamed from: f  reason: collision with root package name */
    public String f46303f;

    /* renamed from: g  reason: collision with root package name */
    public char f46304g;

    /* renamed from: h  reason: collision with root package name */
    public StringBuilder f46305h;

    /* renamed from: a  reason: collision with root package name */
    public int f46298a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final ArrayList f46299b = new ArrayList();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f46300c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    public final ArrayList f46301d = new ArrayList();

    /* renamed from: i  reason: collision with root package name */
    public boolean f46306i = false;

    /* JADX WARN: Type inference failed for: r3v0, types: [wi.s, wi.p, java.lang.Object] */
    public final void a() {
        String str;
        if (!this.f46306i) {
            return;
        }
        String b10 = vi.a.b(this.f46303f);
        StringBuilder sb2 = this.f46305h;
        if (sb2 != null) {
            str = vi.a.b(sb2.toString());
        } else {
            str = null;
        }
        String sb3 = this.f46302e.toString();
        ?? sVar = new s();
        sVar.f48605g = sb3;
        sVar.f48606h = b10;
        sVar.f48607i = str;
        ArrayList arrayList = this.f46301d;
        sVar.g(arrayList);
        arrayList.clear();
        this.f46300c.add(sVar);
        this.f46302e = null;
        this.f46306i = false;
        this.f46303f = null;
        this.f46305h = null;
    }
}
