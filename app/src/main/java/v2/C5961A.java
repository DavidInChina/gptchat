package v2;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;

/* renamed from: v2.A  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5961A implements AbstractC5969h {

    /* renamed from: a  reason: collision with root package name */
    public static final C5961A f47033a = new Object();

    @Override // v2.AbstractC5969h
    public final long a(l lVar) {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // v2.AbstractC5969h
    public final Uri getUri() {
        return null;
    }

    @Override // v2.AbstractC5969h
    public final Map j() {
        return Collections.emptyMap();
    }

    @Override // p2.AbstractC5060m
    public final int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // v2.AbstractC5969h
    public final void close() {
    }

    @Override // v2.AbstractC5969h
    public final void g(F f6) {
    }
}
