package q2;

import java.nio.ByteBuffer;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public final class i extends f {
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00e4 A[LOOP:6: B:37:0x00e4->B:38:0x00e6, LOOP_START, PHI: r0 
      PHI: (r0v2 int) = (r0v0 int), (r0v3 int) binds: [B:16:0x003e, B:38:0x00e6] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // q2.AbstractC5264d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void e(ByteBuffer byteBuffer) {
        int i10;
        int position = byteBuffer.position();
        int limit = byteBuffer.limit();
        int i11 = limit - position;
        int i12 = this.f43667b.f43664c;
        if (i12 != 3) {
            if (i12 != 4) {
                if (i12 != 268435456) {
                    if (i12 != 536870912) {
                        if (i12 != 805306368) {
                            if (i12 != 1342177280) {
                                if (i12 != 1610612736) {
                                    throw new IllegalStateException();
                                }
                            }
                        }
                    }
                    i11 /= 3;
                }
                ByteBuffer l10 = l(i11);
                i10 = this.f43667b.f43664c;
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 268435456) {
                            if (i10 != 536870912) {
                                if (i10 != 805306368) {
                                    if (i10 != 1342177280) {
                                        if (i10 == 1610612736) {
                                            while (position < limit) {
                                                l10.put(byteBuffer.get(position + 1));
                                                l10.put(byteBuffer.get(position));
                                                position += 4;
                                            }
                                        } else {
                                            throw new IllegalStateException();
                                        }
                                    } else {
                                        while (position < limit) {
                                            l10.put(byteBuffer.get(position + 1));
                                            l10.put(byteBuffer.get(position));
                                            position += 3;
                                        }
                                    }
                                } else {
                                    while (position < limit) {
                                        l10.put(byteBuffer.get(position + 2));
                                        l10.put(byteBuffer.get(position + 3));
                                        position += 4;
                                    }
                                }
                            } else {
                                while (position < limit) {
                                    l10.put(byteBuffer.get(position + 1));
                                    l10.put(byteBuffer.get(position + 2));
                                    position += 3;
                                }
                            }
                        } else {
                            while (position < limit) {
                                l10.put(byteBuffer.get(position + 1));
                                l10.put(byteBuffer.get(position));
                                position += 2;
                            }
                        }
                    } else {
                        while (position < limit) {
                            short h10 = (short) (AbstractC5530A.h(byteBuffer.getFloat(position), -1.0f, 1.0f) * 32767.0f);
                            l10.put((byte) (h10 & 255));
                            l10.put((byte) ((h10 >> 8) & 255));
                            position += 4;
                        }
                    }
                } else {
                    while (position < limit) {
                        l10.put((byte) 0);
                        l10.put((byte) ((byteBuffer.get(position) & 255) - 128));
                        position++;
                    }
                }
                byteBuffer.position(byteBuffer.limit());
                l10.flip();
            }
            i11 /= 2;
            ByteBuffer l102 = l(i11);
            i10 = this.f43667b.f43664c;
            if (i10 != 3) {
            }
            byteBuffer.position(byteBuffer.limit());
            l102.flip();
        }
        i11 *= 2;
        ByteBuffer l1022 = l(i11);
        i10 = this.f43667b.f43664c;
        if (i10 != 3) {
        }
        byteBuffer.position(byteBuffer.limit());
        l1022.flip();
    }

    @Override // q2.f
    public final C5262b h(C5262b c5262b) {
        int i10 = c5262b.f43664c;
        if (i10 != 3 && i10 != 2 && i10 != 268435456 && i10 != 536870912 && i10 != 1342177280 && i10 != 805306368 && i10 != 1610612736 && i10 != 4) {
            throw new C5263c(c5262b);
        }
        if (i10 != 2) {
            return new C5262b(c5262b.f43662a, c5262b.f43663b, 2);
        }
        return C5262b.f43661e;
    }
}
