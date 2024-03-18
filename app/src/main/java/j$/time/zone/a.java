package j$.time.zone;

import j$.time.ZoneOffset;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;
import java.util.TimeZone;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes3.dex */
public final class a implements Externalizable {
    private static final long serialVersionUID = -8885321777449118786L;

    /* renamed from: a  reason: collision with root package name */
    private byte f35181a;

    /* renamed from: b  reason: collision with root package name */
    private Object f35182b;

    public a() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(byte b10, Object obj) {
        this.f35181a = b10;
        this.f35182b = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(DataInput dataInput) {
        int readByte = dataInput.readByte() & 255;
        if (readByte == 255) {
            return dataInput.readLong();
        }
        return ((((readByte << 16) + ((dataInput.readByte() & 255) << 8)) + (dataInput.readByte() & 255)) * 900) - 4575744000L;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ZoneOffset b(DataInput dataInput) {
        byte readByte = dataInput.readByte();
        return readByte == Byte.MAX_VALUE ? ZoneOffset.V(dataInput.readInt()) : ZoneOffset.V(readByte * 900);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c(long j6, DataOutput dataOutput) {
        if (j6 < -4575744000L || j6 >= 10413792000L || j6 % 900 != 0) {
            dataOutput.writeByte(255);
            dataOutput.writeLong(j6);
            return;
        }
        int i10 = (int) ((j6 + 4575744000L) / 900);
        dataOutput.writeByte((i10 >>> 16) & 255);
        dataOutput.writeByte((i10 >>> 8) & 255);
        dataOutput.writeByte(i10 & 255);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void d(ZoneOffset zoneOffset, DataOutput dataOutput) {
        int T = zoneOffset.T();
        int i10 = T % 900 == 0 ? T / 900 : 127;
        dataOutput.writeByte(i10);
        if (i10 == 127) {
            dataOutput.writeInt(T);
        }
    }

    private Object readResolve() {
        return this.f35182b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object obj;
        byte readByte = objectInput.readByte();
        this.f35181a = readByte;
        if (readByte == 1) {
            obj = ZoneRules.k(objectInput);
        } else if (readByte == 2) {
            long a5 = a(objectInput);
            ZoneOffset b10 = b(objectInput);
            ZoneOffset b11 = b(objectInput);
            if (b10.equals(b11)) {
                throw new IllegalArgumentException("Offsets must not be equal");
            }
            obj = new b(a5, b10, b11);
        } else if (readByte == 3) {
            obj = e.b(objectInput);
        } else if (readByte != 100) {
            throw new StreamCorruptedException("Unknown serialized type");
        } else {
            obj = new ZoneRules(TimeZone.getTimeZone(objectInput.readUTF()));
        }
        this.f35182b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f35181a;
        Object obj = this.f35182b;
        objectOutput.writeByte(b10);
        if (b10 == 1) {
            ((ZoneRules) obj).l(objectOutput);
        } else if (b10 == 2) {
            ((b) obj).L(objectOutput);
        } else if (b10 == 3) {
            ((e) obj).c(objectOutput);
        } else if (b10 != 100) {
            throw new InvalidClassException("Unknown serialized type");
        } else {
            ((ZoneRules) obj).m(objectOutput);
        }
    }
}
