package androidx.emoji2.text;

import E3.a;
import E3.b;
import Q1.AbstractC1180h;
import Q1.l;
import Q1.m;
import android.content.Context;
import androidx.lifecycle.AbstractC2086v;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.S;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import t7.j;

/* loaded from: classes2.dex */
public class EmojiCompatInitializer implements b {
    @Override // E3.b
    public final List a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // E3.b
    public final /* bridge */ /* synthetic */ Object b(Context context) {
        c(context);
        return Boolean.TRUE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [Q1.y, Q1.h] */
    public final void c(Context context) {
        ?? abstractC1180h = new AbstractC1180h(new j(context, 1));
        abstractC1180h.f14323b = 1;
        if (l.f14326k == null) {
            synchronized (l.f14325j) {
                try {
                    if (l.f14326k == null) {
                        l.f14326k = new l(abstractC1180h);
                    }
                } finally {
                }
            }
        }
        d(context);
    }

    public final void d(Context context) {
        Object obj;
        a c10 = a.c(context);
        c10.getClass();
        synchronized (a.f4426e) {
            try {
                obj = c10.f4427a.get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = c10.b(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        S h10 = ((AbstractC2086v) obj).h();
        h10.a(new m(this, h10));
    }
}
