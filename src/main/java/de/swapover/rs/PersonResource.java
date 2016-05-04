
package de.swapover.rs;

import de.swapover.model.Person;
import io.swagger.annotations.*;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by mikulicv on 02.05.16.
 */
@Path("/person")
@Api(value = "Demo resource", description = "My demo Resource")
public class PersonResource {

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @ApiOperation(value = "Holt eine Person",
            httpMethod = "GET", notes = "Holt den Vor- und Nachnamen einer Person", response = Person.class)
    @ApiResponses(value = {@ApiResponse(code = 500, message = "Internal server error mit Fehlermeldungstext")})
    public Person getIt(@ApiParam(value = "PersonId", required = true) @PathParam("id") Integer id) {
        return new Person(id,"John J.", "Rambo");
    }
}
