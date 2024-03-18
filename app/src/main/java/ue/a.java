package Ue;

import java.io.Closeable;
import java.util.LinkedHashMap;

/* loaded from: classes2.dex */
public final class a implements Closeable {

    /* renamed from: Y  reason: collision with root package name */
    public boolean f17714Y;

    /* renamed from: Z  reason: collision with root package name */
    public final LinkedHashMap f17715Z = new LinkedHashMap();

    public final synchronized void a(Re.a aVar) {
        if (this.f17714Y) {
            aVar.close();
        } else {
            this.f17715Z.put(aVar, aVar);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            this.f17714Y = true;
            for (Closeable closeable : this.f17715Z.values()) {
                closeable.close();
            }
            this.f17715Z.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
