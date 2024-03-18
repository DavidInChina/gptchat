package U0;

import android.os.LocaleList;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: classes.dex */
public final class b implements f {

    /* renamed from: Y  reason: collision with root package name */
    public LocaleList f17379Y;

    /* renamed from: Z  reason: collision with root package name */
    public d f17380Z;

    /* renamed from: h0  reason: collision with root package name */
    public final P5.c f17381h0 = new Object();

    @Override // U0.f
    public final d a() {
        LocaleList localeList;
        int size;
        Locale locale;
        localeList = LocaleList.getDefault();
        synchronized (this.f17381h0) {
            d dVar = this.f17380Z;
            if (dVar == null || localeList != this.f17379Y) {
                size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i10 = 0; i10 < size; i10++) {
                    locale = localeList.get(i10);
                    arrayList.add(new c(new a(locale)));
                }
                d dVar2 = new d(arrayList);
                this.f17379Y = localeList;
                this.f17380Z = dVar2;
                return dVar2;
            }
            return dVar;
        }
    }

    @Override // U0.f
    public final a r(String str) {
        return new a(Locale.forLanguageTag(str));
    }
}
