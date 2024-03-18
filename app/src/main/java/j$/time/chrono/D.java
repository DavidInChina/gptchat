package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes3.dex */
final class D implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;

    /* renamed from: a  reason: collision with root package name */
    private byte f34903a;

    /* renamed from: b  reason: collision with root package name */
    private Object f34904b;

    public D() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public D(byte b10, Object obj) {
        this.f34903a = b10;
        this.f34904b = obj;
    }

    private Object readResolve() {
        return this.f34904b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object obj;
        byte readByte = objectInput.readByte();
        this.f34903a = readByte;
        switch (readByte) {
            case 1:
                int i10 = AbstractC3698a.f34912c;
                obj = AbstractC3698a.r(objectInput.readUTF());
                break;
            case 2:
                obj = ((ChronoLocalDate) objectInput.readObject()).y((j$.time.i) objectInput.readObject());
                break;
            case 3:
                obj = ((ChronoLocalDateTime) objectInput.readObject()).o((ZoneOffset) objectInput.readObject()).l((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = w.f34951d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                u.f34949d.getClass();
                obj = new w(LocalDate.of(readInt, readByte2, readByte3));
                break;
            case 5:
                x xVar = x.f34955d;
                obj = x.t(objectInput.readByte());
                break;
            case 6:
                n nVar = (n) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                nVar.getClass();
                obj = p.S(nVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                z.f34961d.getClass();
                obj = new B(LocalDate.of(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                F.f34906d.getClass();
                obj = new H(LocalDate.of(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i11 = C3704g.f34917e;
                obj = new C3704g(AbstractC3698a.r(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.f34904b = obj;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b10 = this.f34903a;
        Object obj = this.f34904b;
        objectOutput.writeByte(b10);
        switch (b10) {
            case 1:
                objectOutput.writeUTF(((AbstractC3698a) obj).getId());
                return;
            case 2:
                ((C3703f) obj).writeExternal(objectOutput);
                return;
            case 3:
                ((j) obj).writeExternal(objectOutput);
                return;
            case 4:
                w wVar = (w) obj;
                wVar.getClass();
                objectOutput.writeInt(j$.time.temporal.q.a(wVar, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(wVar, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(wVar, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 5:
                ((x) obj).F(objectOutput);
                return;
            case 6:
                ((p) obj).writeExternal(objectOutput);
                return;
            case 7:
                B b11 = (B) obj;
                b11.getClass();
                objectOutput.writeInt(j$.time.temporal.q.a(b11, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(b11, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(b11, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 8:
                H h10 = (H) obj;
                h10.getClass();
                objectOutput.writeInt(j$.time.temporal.q.a(h10, j$.time.temporal.a.YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(h10, j$.time.temporal.a.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.q.a(h10, j$.time.temporal.a.DAY_OF_MONTH));
                return;
            case 9:
                ((C3704g) obj).a(objectOutput);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
