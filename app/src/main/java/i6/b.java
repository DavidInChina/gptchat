package i6;

import id.AbstractC3557B;
import java.util.LinkedHashMap;
import p5.AbstractC5091c;
import p5.AbstractC5092d;
import p5.EnumC5090b;

/* loaded from: classes.dex */
public abstract class b {

    /* renamed from: a */
    public static final LinkedHashMap f32721a = new LinkedHashMap();

    /* JADX WARN: Multi-variable type inference failed */
    public static final f a(AbstractC5092d abstractC5092d) {
        f fVar;
        r5.d dVar;
        AbstractC5091c l10;
        AbstractC3557B.c0("sdkCore", abstractC5092d);
        LinkedHashMap linkedHashMap = f32721a;
        synchronized (linkedHashMap) {
            try {
                f fVar2 = (f) linkedHashMap.get(abstractC5092d);
                fVar = fVar2;
                if (fVar2 == null) {
                    if (abstractC5092d instanceof r5.d) {
                        dVar = (r5.d) abstractC5092d;
                    } else {
                        dVar = null;
                    }
                    if (dVar != null && (l10 = dVar.l()) != null) {
                        P4.a.m0(l10, 4, EnumC5090b.f42738Y, new X0.b(21, abstractC5092d), null, false, 56);
                    }
                    fVar = new Object();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return fVar;
    }
}
