package Ke;

import id.AbstractC3557B;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final ByteBuffer f9786a;

    static {
        ByteBuffer order = ByteBuffer.allocate(0).order(ByteOrder.BIG_ENDIAN);
        AbstractC3557B.b0("allocate(0).order(ByteOrder.BIG_ENDIAN)", order);
        f9786a = order;
    }

    public static final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, int i10, int i11, int i12) {
        AbstractC3557B.c0("destination", byteBuffer2);
        if (byteBuffer.hasArray() && byteBuffer2.hasArray() && !byteBuffer.isReadOnly() && !byteBuffer2.isReadOnly()) {
            System.arraycopy(byteBuffer.array(), byteBuffer.arrayOffset() + i10, byteBuffer2.array(), byteBuffer2.arrayOffset() + i12, i11);
            return;
        }
        ByteBuffer duplicate = byteBuffer.duplicate();
        duplicate.position(i10);
        duplicate.limit(i10 + i11);
        ByteBuffer duplicate2 = byteBuffer2.duplicate();
        duplicate2.position(i12);
        duplicate2.put(duplicate);
    }
}
