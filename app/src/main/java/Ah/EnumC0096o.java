package Ah;

import j$.util.concurrent.ConcurrentHashMap;
import java.net.URL;

/* renamed from: Ah.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public enum EnumC0096o {
    MANIFEST(true),
    LATENT(false);
    

    /* renamed from: Y  reason: collision with root package name */
    public final boolean f952Y;

    EnumC0096o(boolean z10) {
        this.f952Y = z10;
    }

    public abstract byte[] a(String str, ConcurrentHashMap concurrentHashMap);

    public abstract URL b(String str, ConcurrentHashMap concurrentHashMap);
}
