package j$.io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
final class a implements Iterator {

    /* renamed from: a  reason: collision with root package name */
    private final BufferedReader f34870a;

    /* renamed from: b  reason: collision with root package name */
    String f34871b = null;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(BufferedReader bufferedReader) {
        this.f34870a = bufferedReader;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f34871b != null) {
            return true;
        }
        try {
            String readLine = this.f34870a.readLine();
            this.f34871b = readLine;
            return readLine != null;
        } catch (IOException e10) {
            throw new UncheckedIOException(e10);
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f34871b != null || hasNext()) {
            String str = this.f34871b;
            this.f34871b = null;
            return str;
        }
        throw new NoSuchElementException();
    }
}
