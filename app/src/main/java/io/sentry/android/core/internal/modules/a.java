package io.sentry.android.core.internal.modules;

import android.content.Context;
import io.sentry.EnumC3642e1;
import io.sentry.H;
import io.sentry.internal.modules.d;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public final class a extends d {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f34134d;

    /* renamed from: e  reason: collision with root package name */
    public final Object f34135e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a(Object obj, H h10, int i10) {
        super(h10);
        this.f34134d = i10;
        this.f34135e = obj;
    }

    @Override // io.sentry.internal.modules.d
    public final Map b() {
        InputStream open;
        int i10 = this.f34134d;
        H h10 = this.f34398a;
        Object obj = this.f34135e;
        switch (i10) {
            case 0:
                TreeMap treeMap = new TreeMap();
                try {
                    open = ((Context) obj).getAssets().open("sentry-external-modules.txt");
                    try {
                        TreeMap c10 = c(open);
                        if (open != null) {
                            open.close();
                        }
                        return c10;
                    } finally {
                        if (open != null) {
                            try {
                                open.close();
                            } catch (Throwable th2) {
                                th.addSuppressed(th2);
                            }
                        }
                    }
                } catch (FileNotFoundException unused) {
                    h10.f(EnumC3642e1.INFO, "%s file was not found.", "sentry-external-modules.txt");
                    return treeMap;
                } catch (IOException e10) {
                    h10.d(EnumC3642e1.ERROR, "Error extracting modules.", e10);
                    return treeMap;
                }
            case 1:
                TreeMap treeMap2 = new TreeMap();
                for (io.sentry.internal.modules.a aVar : (List) obj) {
                    Map a5 = aVar.a();
                    if (a5 != null) {
                        treeMap2.putAll(a5);
                    }
                }
                return treeMap2;
            default:
                TreeMap treeMap3 = new TreeMap();
                try {
                    open = ((ClassLoader) obj).getResourceAsStream("sentry-external-modules.txt");
                    try {
                        if (open == null) {
                            h10.f(EnumC3642e1.INFO, "%s file was not found.", "sentry-external-modules.txt");
                            if (open != null) {
                                open.close();
                            }
                        } else {
                            TreeMap c11 = c(open);
                            open.close();
                            treeMap3 = c11;
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                } catch (IOException e11) {
                    h10.d(EnumC3642e1.INFO, "Access to resources failed.", e11);
                } catch (SecurityException e12) {
                    h10.d(EnumC3642e1.INFO, "Access to resources denied.", e12);
                }
                return treeMap3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(H h10) {
        this(h10, a.class.getClassLoader());
        this.f34134d = 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(H h10, ClassLoader classLoader) {
        super(h10);
        this.f34134d = 2;
        this.f34135e = classLoader == null ? ClassLoader.getSystemClassLoader() : classLoader;
    }
}
