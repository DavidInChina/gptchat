package com.google.protobuf;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2493c implements M0 {
    protected int memoizedHashCode;

    @Deprecated
    public static <T> void addAll(Iterable<T> iterable, Collection<? super T> collection) {
        AbstractC2490b.a(iterable, (List) collection);
    }

    public static void checkByteStringIsUtf8(AbstractC2534q abstractC2534q) {
        if (abstractC2534q.T()) {
            return;
        }
        throw new IllegalArgumentException("Byte string is not UTF-8.");
    }

    public final String a(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public abstract int getSerializedSize(AbstractC2504f1 abstractC2504f1);

    public u1 newUninitializedMessageException() {
        return new u1();
    }

    public byte[] toByteArray() {
        try {
            int serializedSize = getSerializedSize();
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC2549y.f27642d;
            C2545w c2545w = new C2545w(bArr, serializedSize);
            writeTo(c2545w);
            if (c2545w.u0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(a("byte array"), e10);
        }
    }

    public AbstractC2534q toByteString() {
        try {
            int serializedSize = getSerializedSize();
            C2532p c2532p = AbstractC2534q.f27581Z;
            byte[] bArr = new byte[serializedSize];
            Logger logger = AbstractC2549y.f27642d;
            C2545w c2545w = new C2545w(bArr, serializedSize);
            writeTo(c2545w);
            if (c2545w.u0() == 0) {
                return new C2532p(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e10) {
            throw new RuntimeException(a("ByteString"), e10);
        }
    }

    public void writeDelimitedTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        int q02 = AbstractC2549y.q0(serializedSize) + serializedSize;
        if (q02 > 4096) {
            q02 = 4096;
        }
        C2547x c2547x = new C2547x(outputStream, q02);
        c2547x.O0(serializedSize);
        writeTo(c2547x);
        if (c2547x.f27638h > 0) {
            c2547x.W0();
        }
    }

    public void writeTo(OutputStream outputStream) {
        int serializedSize = getSerializedSize();
        Logger logger = AbstractC2549y.f27642d;
        if (serializedSize > 4096) {
            serializedSize = 4096;
        }
        C2547x c2547x = new C2547x(outputStream, serializedSize);
        writeTo(c2547x);
        if (c2547x.f27638h > 0) {
            c2547x.W0();
        }
    }

    public static <T> void addAll(Iterable<T> iterable, List<? super T> list) {
        AbstractC2490b.a(iterable, list);
    }
}
