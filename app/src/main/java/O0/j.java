package O0;

import android.os.Build;
import android.text.StaticLayout;

/* loaded from: classes.dex */
public final class j implements o {
    @Override // O0.o
    public StaticLayout a(p pVar) {
        StaticLayout.Builder obtain = StaticLayout.Builder.obtain(pVar.f13293a, pVar.f13294b, pVar.f13295c, pVar.f13296d, pVar.f13297e);
        obtain.setTextDirection(pVar.f13298f);
        obtain.setAlignment(pVar.f13299g);
        obtain.setMaxLines(pVar.f13300h);
        obtain.setEllipsize(pVar.f13301i);
        obtain.setEllipsizedWidth(pVar.f13302j);
        obtain.setLineSpacing(pVar.f13304l, pVar.f13303k);
        obtain.setIncludePad(pVar.f13306n);
        obtain.setBreakStrategy(pVar.f13308p);
        obtain.setHyphenationFrequency(pVar.f13311s);
        obtain.setIndents(pVar.f13312t, pVar.f13313u);
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 26) {
            k.a(obtain, pVar.f13305m);
        }
        if (i10 >= 28) {
            l.a(obtain, pVar.f13307o);
        }
        if (i10 >= 33) {
            m.b(obtain, pVar.f13309q, pVar.f13310r);
        }
        return obtain.build();
    }
}
